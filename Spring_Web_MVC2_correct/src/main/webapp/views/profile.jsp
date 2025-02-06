<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Employee Profile</title>
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    
    <div class="container mt-5">
        <div class="card p-4 shadow-sm">
            <h3 class="text-center text-primary">Employee Profile</h3>
            <hr>

            <!-- Form Section -->
            <form action="/" method="get">
                <div class="mb-3">
                    <label class="form-label">Enter Employee ID:</label>
                    <input type="text" name="id" class="form-control" placeholder="Enter ID" required>
                </div>
                <div class="text-center">
                    <button type="submit" class="btn btn-primary">Search</button>
                </div>
            </form>

            <hr>

            <!-- Employee Details Section -->
            <c:if test="${not empty msg}">
                <div class="p-3">
                    <h5 class="text-success text-center">Employee Details</h5>
                    <p><strong>ID:</strong> ${msg.id}</p>
                    <p><strong>Name:</strong> ${msg.name}</p>
                    <p><strong>Role:</strong> ${msg.role}</p>
                </div>
            </c:if>
        </div>
    </div>

    <!-- Bootstrap JS Bundle -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
