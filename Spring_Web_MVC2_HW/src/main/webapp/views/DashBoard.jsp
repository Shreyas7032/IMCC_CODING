<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>College Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    <style>
        body {
            background: #f8f9fa;
        }
        .navbar {
            background: #007bff !important;
        }
        .navbar-brand, .nav-link {
            color: white !important;
        }
        .card {
            transition: transform 0.3s ease-in-out;
        }
        .card:hover {
            transform: scale(1.05);
        }
        .sliding-panel {
            position: fixed;
            top: 0;
            left: -300px;
            width: 300px;
            height: 100vh;
            background: #007bff;
            color: white;
            padding: 20px;
            transition: left 0.5s ease-in-out;
        }
        .sliding-panel.show {
            left: 0;
        }
        .toggle-btn {
            position: absolute;
            top: 20px;
            left: 310px;
            background: #007bff;
            color: white;
            border: none;
            padding: 10px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <button class="toggle-btn" onclick="togglePanel()">☰</button>
    <div class="sliding-panel" id="sidePanel">
        <h4>Navigation</h4>
        <ul class="list-unstyled">
            <li><a href="#" class="text-white">Student Enquiry</a></li>
            <li><a href="#" class="text-white">Show All</a></li>
            <li><a href="#" class="text-white">Admissions</a></li>
            <li><a href="#" class="text-white">Courses</a></li>
            <li><a href="#" class="text-white">Contact</a></li>
        </ul>
    </div>

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container">
            <a class="navbar-brand" href="#">College Dashboard</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="#">Student Enquiry</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Show All</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Admissions</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Courses</a></li>
                    <li class="nav-item"><a class="nav-link" href="#">Contact</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="container mt-5">
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <img src="https://source.unsplash.com/400x300/?students,university" class="card-img-top" alt="Student Enquiry">
                    <div class="card-body text-center">
                        <h5 class="card-title">Student Enquiry</h5>
                        <p class="card-text">Submit your inquiries and get information about our programs.</p>
                        <a href="/profile" class="btn btn-primary">Go</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://source.unsplash.com/400x300/?education,lecture" class="card-img-top" alt="Show All">
                    <div class="card-body text-center">
                        <h5 class="card-title">Show All</h5>
                        <p class="card-text">View all registered students and their details.</p>
                        <a href="#" class="btn btn-primary">Go</a>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <img src="https://source.unsplash.com/400x300/?books,library" class="card-img-top" alt="Admissions">
                    <div class="card-body text-center">
                        <h5 class="card-title">Admissions</h5>
                        <p class="card-text">Learn about our admission process and apply online.</p>
                        <a href="#" class="btn btn-primary">Go</a>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        function togglePanel() {
            var panel = document.getElementById('sidePanel');
            panel.classList.toggle('show');
        }
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
