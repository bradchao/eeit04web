window.onload = function(){
	let canvas, ctx;
	let webSocket = new WebSocket("ws://10.0.104.177:8080/bradweb/mycenter");
	let isConnect = false;
	
	canvas = document.getElementById("myDrawer");
	ctx = canvas.getContext("2d");
	
	webSocket.onopen = function(){
		isConnect = true;
	};
	webSocket.onmessage = function(e){
		if (isConnect){
			let mesgObj = JSON.parse(e.data);
			if (mesgObj.isClear){
				clear();
			}else{
				if (mesgObj.isNewLine){
					newLine(mesgObj.x, mesgObj.y);
				}else{
					drawLine(mesgObj.x, mesgObj.y);
				}
			}		
		}
	};
	webSocket.onclose = function(){
		isConnect = false;
	};
	webSocket.onerror = function(){
		
	};
	
	function clear(){
		ctx.clearRect(0,0, canvas.width, canvas.height);
	}
	function newLine(x, y){
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(x, y);		
	}
	function drawLine(x, y){
		ctx.lineTo(x, y);
		ctx.stroke();		
	}

	
	
}