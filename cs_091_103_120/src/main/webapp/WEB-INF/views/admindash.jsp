
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!--<title> Dashboard </title>-->
    <link rel="stylesheet" href="css/styleadmin.css">
    
   </head>


<body>
  <div class="sidebar" >
    <div class="logo-details">
      <img src="img/LOGO_rm.png" width="100" height="100" left="80px"  top="20px"/> 
      <span class="logo_name" align="left">Proman</span>
      <i class='bx bxl-c-plus-plus'></i>
      
     
    </div>
      <ul class="nav-links">
        <li>
          <a href="/cs_091_103_120/adminadduser" class="active">
            <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Add User</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-box' ></i>
            <span class="links_name">Edit User</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-list-ul' ></i>
            <span class="links_name">Delete User</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-pie-chart-alt-2' ></i>
            <span class="links_name">Add Project</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-coin-stack' ></i>
            <span class="links_name">Edit Project</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-book-alt' ></i>
            <span class="links_name">Delete Project</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-user' ></i>
            <span class="links_name">Create Team</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-message' ></i>
            <span class="links_name">Allocate Members</span>
          </a>
        </li>
        <li >
          <a href="#">
            <i class='bx bx-log-out'></i>
            <span class="links_name">Log out</span>
          </a>
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Dashboard</span>
      </div>
     
      <div class="profile-details">
        <!--<img src="images/profile.jpg" alt="">-->
        <span class="admin_name"><%= request.getAttribute("user") %></span>
        <i class='bx bx-chevron-down' ></i>
      </div>
    </nav>

    <div class="home-content">
      <div class="overview-boxes">
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Users </div>
           
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text"> T</span>
            </div>
          </div>
          <i class='bx bx-cart-alt cart'></i>
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Projects</div>
           
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text">t</span>
            </div>
          </div>
          <i class='bx bxs-cart-add cart two' ></i>
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Teams</div>
         
            <div class="indicator">
              <i class='bx bx-up-arrow-alt'></i>
              <span class="text">t</span>
            </div>
          </div>
          <i class='bx bx-cart cart three' ></i>
        </div>
      
      </div>

      



</body>
</html>