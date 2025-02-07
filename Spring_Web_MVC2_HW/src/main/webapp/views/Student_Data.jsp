<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Information</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body { background-color: #f8f9fa; }
        .container { max-width: 600px; margin-top: 50px; }
        .card { padding: 20px; }
        h1 { color: #007bff; }
    </style>
</head>
<body>

<div class="container">
    <div class="card shadow-lg">
        <h1 class="text-center">Student Information</h1>
        <h2>${msg }</h2>
        <hr>

        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Gender:</strong> ${gender}</p>
        <p><strong>Course:</strong> ${course}</p>

        <a href="/" class="btn btn-primary w-100">Go Back</a>
    </div>
</div>

</body>
</html>
