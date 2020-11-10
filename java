var mostrar1=function(){
		var x=document.getElementById("player");
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d2");
	
		


		n3.className="cuadro3";
		if(n3.className=="cuadro3")
		{
			n3.className="cuadro4";
			x.play();
		}

		

		
	}


var ocultar1=function(){
	var x=document.getElementById("player")
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d2");
		var n4=document.getElementById("d3");

		
		n3.className="cuadro4";
		if(n3.className=="cuadro4")
		{
			n3.className="cuadro3";
			x.pause();
		}
}

var mostrar2=function(){
	var x=document.getElementById("player1")
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d4");
	
		

		
		n3.className="cuadro6";
		if(n3.className=="cuadro6")
		{
			n3.className="cuadro7";
			x.play();
		}

		

		
	}
var ocultar2=function(){
		var x=document.getElementById("player1")
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d4");
		

		
		n3.className="cuadro7";
		if(n3.className=="cuadro7")
		{
			n3.className="cuadro6";
			x.pause();
		}
}


var mostrar3=function(){
	var x=document.getElementById("player2")
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d6");
	
		


		n3.className="cuadro9";
		if(n3.className=="cuadro9")
		{
			n3.className="cuadro10";
			x.play();
		}

		

		
	}
var ocultar3=function(){
	var x=document.getElementById("player2")
		var n1=document.getElementById("c1");
		var n2=document.getElementById("d1");
		var n3=document.getElementById("d6");
		

		
		n3.className="cuadro10";
		if(n3.className=="cuadro10")
		{
			n3.className="cuadro9";
			x.pause();
		}
}	