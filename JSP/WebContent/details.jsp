<!DOCTYPE html>
<html>
<head>
<title>Register</title>
<link rel="stylesheet" type="text/css" href="css/form-style-10.css">
</head>
<body>

	<script>
    function validateForm()
    {
    var x=document.myForm.field6.value;
    var y=document.myForm.field7.value;
   /*  var z = document.myForm.field7.value; //will work */
        if(x!=y)
        {
            alert("Password mismatch");
            return false;
        }
   /* No need used: required */
       /*  else if(z =='' || z == null) 
        {
        alert("You must agree to our Terms and Policy");
        return false;
        } */
    }
</script>

	<div class="form-style-10">

		<h1 id="renter">
			Welcome! To Matrix Inc.<span>Sign In To Get Yourself
				Registered! </span>
		</h1>


		<form method="post" onsubmit="return validateForm()" name='myForm'
			action="register">

			<div class="section">
				<span>1</span>Name, Address &amp; Date of Birth
			</div>
			<div class="inner-wrap">
				<label>Your Full Name <input type="text" name="field1"
					required /></label> <label>Address <textarea name="field2"></textarea></label>
				<label>Date Of Birth <input type="date" min="1992-01-01"
					max="2015-01-01" name="field9" required></label>
			</div>

			<div class="section">
				<span>2</span>Email, Phone &amp; Gender
			</div>
			<div class="inner-wrap">
				<label>Email Address <input type="email" name="field3"
					required /></label> <label>Phone Number <input type="text"
					name="field4" required /></label> <label>Gender <br> <input
					type="radio" name="field5" value="Male" checked>Male <input
					type="radio" name="field5" value="Female">Female
				</label>
			</div>

			<div class="section">
				<span>3</span>Passwords
			</div>
			<div class="inner-wrap">
				<label>Password <input type="password" name="field6"
					required /></label> <label>Confirm Password <input type="password"
					name="field7" required /></label>
			</div>
			<div class="button-section">
				<input type="submit" name="submit" /> 
				<a class="link" href="index.jsp">Back</a>
				<span class="privacy-policy">
					<input type="checkbox" name="field8" required>You agree to
					our Terms and Policy.
				</span>
			</div>
		</form>
	</div>

</body>
</html>