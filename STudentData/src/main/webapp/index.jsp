<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
<sx:head />
</head>
<body>
<h1>Student Form</h1>
<s:form action="Log">
<s:textfield name="id" label="Enter Id"></s:textfield>
<s:textfield name="name" label="Enter Name"></s:textfield>
<s:radio list="{'Male','FeMale'}" name="gender" label="Enter Gender"></s:radio>
<sx:datetimepicker name="date3" label="Enter Date"
displayFormat="dd-MMM-yyyy"/>
<s:submit value="Click"/>
</s:form>
</body>
</html>
