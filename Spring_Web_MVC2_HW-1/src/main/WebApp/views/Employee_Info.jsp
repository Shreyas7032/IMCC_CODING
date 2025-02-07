<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card shadow-lg p-4 bg-white rounded">
            <h2 class="text-center text-primary">Employee Registration</h2>
            
    
            <form:form action="/save" modelAttribute="employee" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label">Employee Name:</label>
                    <form:input path="name" id="name" class="form-control" placeholder="Enter Name"/>
                </div>
                
                <div class="mb-3">
                    <label for="email" class="form-label">Employee Email:</label>
                    <form:input path="email" id="email" class="form-control" placeholder="Enter Email"/>
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender:</label><br>
                    <div class="form-check form-check-inline">
                        <form:radiobutton path="gender" value="Male" class="form-check-input"/>
                        <label class="form-check-label">Male</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <form:radiobutton path="gender" value="Female" class="form-check-input"/>
                        <label class="form-check-label">Female</label>
                    </div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Shift:</label><br>
                    <div class="form-check form-check-inline">
                        <form:checkbox path="shift_Timing" value="Morning" class="form-check-input"/>
                        <label class="form-check-label">Morning</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <form:checkbox path="shift_Timing" value="Evening" class="form-check-input"/>
                        <label class="form-check-label">Evening</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <form:checkbox path="shift_Timing" value="Night" class="form-check-input"/>
                        <label class="form-check-label">Night</label>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="designation" class="form-label">Designation:</label>
                    <form:select path="designation" id="designation" class="form-select">
                        <form:option value="HR">HR</form:option>
                        <form:option value="Manager">Manager</form:option>
                        <form:option value="Supervisor">Supervisor</form:option>
                        <form:option value="Peon">Peon</form:option>
                    </form:select>
                </div>

                <div class="text-center">
                    <form:button class="btn btn-primary px-4">Submit</form:button>
                </div>
            </form:form>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
