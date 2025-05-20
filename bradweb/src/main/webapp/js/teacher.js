window.onload = function(){
	let canvas, ctx, clear;
	let webSocket = new WebSocket("ws://10.0.104.177:8080/bradweb/mycenter");
	let isConnect = false;
	
	webSocket.onopen = function(){
		isConnect = true;	
		let data = {
			isTeacher: true
		}
		webSocket.send(JSON.stringify(data));
	};
	webSocket.onmessage = function(){
		
	};
	webSocket.onclose = function(){
		isConnect = false;
	};
	webSocket.onerror = function(){
		
	};

	let isDrag = false;	
	clear = document.getElementById("clear");
	canvas = document.getElementById("myDrawer");
	ctx = canvas.getContext("2d");
	
	clear.addEventListener("click", function(){
		ctx.clearRect(0,0, canvas.width, canvas.height);
		if (isConnect){
			let data = {
				isClear : true
			};
			webSocket.send(JSON.stringify(data));
		}
		
	});
	
	canvas.onmousedown = function(e){
		isDrag = true;
		let x = e.offsetX, y = e.offsetY;
		ctx.beginPath();
		ctx.lineWidth = 4;
		ctx.moveTo(x, y);
		
		if (isConnect){
			let data = {
				isClear : false,
				isNewLine: true,
				x : x,
				y : y
			};
			webSocket.send(JSON.stringify(data));
		}
		
	};
	canvas.onmousemove = function(e){
		if (isDrag){
			let x = e.offsetX, y = e.offsetY;
			ctx.lineTo(x, y);
			ctx.stroke();
			
			if (isConnect){
				let data = {
					isClear : false,
					isNewLine: false,
					x : x,
					y : y
				};
				webSocket.send(JSON.stringify(data));
			}
						
		}
	};
	canvas.onmouseup = function(e){
		isDrag = false;
	};
	
	
	
	
}