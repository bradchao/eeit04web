window.onload = function(){
	let canvas, ctx, clear;
	let webSocket = new WebSocket("ws://10.0.104.177:8080/bradweb/myserver");
	
	webSocket.onopen = function(){
		
	};
	webSocket.onmessage = function(){
		
	};
	webSocket.onclose = function(){
		
	};
	webSocket.onerror = function(){
		
	};

	let isDrag = false;	
	clear = document.getElementById("clear");
	canvas = document.getElementById("myDrawer");
	ctx = canvas.getContext("2d");
	
	clear.addEventListener("click", function(){
		ctx.clearRect(0,0, canvas.width, canvas.height);
	});
	
	canvas.onmousedown = function(e){
		isDrag = true;
		let x = e.offsetX, y = e.offsetY;
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(x, y);
	};
	canvas.onmousemove = function(e){
		if (isDrag){
			let x = e.offsetX, y = e.offsetY;
			ctx.lineTo(x, y);
			ctx.stroke();			
		}
	};
	canvas.onmouseup = function(e){
		isDrag = false;
	};
	
	
	
	
}