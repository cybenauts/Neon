
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.matrix.model.Employee"%>
<!DOCTYPE html>
<html>
<head>
<title>Update</title>
<link rel="stylesheet" type="text/css" href="css/form-style-10.css">
</head>
<body>
	<script>
		    function validateForm()
		{
		    var x=document.myForm.field6.value;
		    var y=document.myForm.field7.value;
		   /*  var z = document.myForm.field7.value; //will work */
		        if(x!=y){
		            alert("Password mismatch");
		            return false;
		        }}
		</script>
	<div class="form-style-10">
		<h1 id="renter">
			Welcome! To Matrix Inc.<span>Update The Required Entries! </span>
		</h1>
		<form method="post" onsubmit="return validateForm()" name='myForm'
			action="updater">

			<%Employee emp = (Employee)session.getAttribute("emp"); %>

			<div class="section">
				<span>1</span>Name, Address &amp; Date of Birth
			</div>
			<div class="inner-wrap">
				<label>Your Full Name <input type="text" name="field1"
					value='<%=emp.getName()%>' /></label> <label>Address <textarea
						name="field2" disabled="disabled"></textarea></label> <label>Date
					Of Birth <input type="date" min="1992-01-01" max="2015-12-30"
					name="field9" value=<%=emp.getDob()%>>
				</label>
			</div>
			 <% 
			 String chk1 = "";
			 String chk2 = "";
			 if(emp.getGender()=="M")
		      {
		    	chk1="checked";
			} 
			else
			{
				chk2 = "checked";
			}
		 
		 
		 %>

			<div class="section">
				<span>2</span>Email, Phone &amp; Gender
			</div>
			<div class="inner-wrap">
				<label>Email Address <input type="email" name="field3"
					readonly="readonly" value=<%=emp.getEmail()%> /></label> <label>Phone
					Number <input type="text" name="field4" readonly="readonly"
					value=<%=emp.getPhone()%> />
				</label> <label>Gender <br> <input type="radio" name="field5"
					value="Male" <%= chk1%> >Male <input type="radio"
					name="field5" value="Female" <%= chk2%>>Female
				</label>
			</div>

			<div class="section">
				<span>3</span>Passwords
			</div>
			<div class="inner-wrap">
				<label>New Password <input type="password" name="field6"
					required /></label> <label>Confirm Password <input type="password"
					name="field7" required /></label>
			</div>
			<div class="button-section">
				<input type="submit" name="submit" value="Update" />
				 <a class="link" href="index.jsp">Back</a>
				 <span	class="privacy-policy"> <input type="checkbox" name="field8"
					required>Ready to update?
				</span>
			</div>
		</form>
	</div>

</body>
</html>