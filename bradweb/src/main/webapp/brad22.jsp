<%
	Integer xx = (Integer) request.getAttribute("xx");
	Integer yy = (Integer) request.getAttribute("yy");
%>
<div>I am brad22</div>
<%
	out.print(String.format("%d + %d = %d",xx, yy, xx+yy ));
%>