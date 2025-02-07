<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8d7da; }
        .error-container {
            max-width: 500px;
            margin: 50px auto;
            background: white;
            padding: 20px;
            border-radius: 10px;
            text-align: center;
        }
        h1 { color: #721c24; }
    </style>
</head>
<body>
    <div class="error-container">
        <h1>Oops! Something went wrong.</h1>
        <p class="text-danger">An error occurred while processing your request.</p>
        <p>${errorMessage}</p>  <%-- Display error message dynamically --%>
        <a href="/" class="btn btn-danger">Go Back</a>
    </div>
</body>
</html>
