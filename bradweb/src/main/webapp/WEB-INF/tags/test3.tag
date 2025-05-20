<%@tag import="java.util.HashSet"%>
<%
	HashSet<Integer> lottery = new HashSet<>();
	while (lottery.size() < 6){
		lottery.add((int)(Math.random()*49+1));
	}
	out.print(lottery);
%>