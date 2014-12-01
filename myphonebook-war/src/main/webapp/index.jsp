<%@ page contentType="text/html" import="code.myphonebookpak.*, javax.naming.* " %>

<%
	String searchName = "";
	if (request.getParameter("searchname") != null) {
		searchName=request.getParameter("searchname");
	}
%>

<html><head><title>Phonebook</title></head><body>
<form action="index.jsp">
<b>Search number</b>:<br>
Enter name: <input type="text" name="searchname" value="<%=searchName%>">  
<input type="submit" value="Search">
(Try<a href="index.jsp?searchname=Joe">Joe</a>)
</form>
<%
	if (! searchName.equals("")) {
		String number="";
		try {
			Context context = new InitialContext();
			MyPhonebookLocal myPhonebookLocal = (MyPhonebookLocal)context.lookup("java:comp/env/ejb/MyPhonebookBean");
			PhoneBook phonebook = myPhonebookLocal.findByPrimaryKey(searchName);
			if(phonebook != null) {
				number =  phonebook.getNumber();
			}	
		}
		catch (Exception e) {
			number=e.toString();
		}
		out.println("This is the number returned from the EJB when searching for '"+searchName+"' : " + number);
	}
%>

</body></html>
