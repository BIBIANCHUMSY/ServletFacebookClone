<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 24/10/2023
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/signIn.css">
    <title>Title</title>
</head>
<body>
<header>
    <div class="main">
        <div class="left">
            <img src="${pageContext.request.contextPath}/img/facebook%201.svg" alt="">
            <p>Connect with friends and the world around you on Facebook.</p>
        </div>
        <div class="right">
            <form action="<%=request.getContextPath()%>/User-Login" method="post">
                <div class="form_body">
                    <input type="text" name="userEmail" id="userEmail" placeholder="Email" required>
                    <input type="password" name="userPassword" id="userPassword" placeholder="Password" required>
                    <button class="login">Log In</button>
                    <p class="forget">Forgot password?</p>
                    <hr>
                </div>
            </form>
            <div class="empty">
                <button class="create" onclick="show()">Create new account</button>
            </div>
            <p class="foot"><span>Create a Page</span> for a celebrity, brand, or business.</p>
        </div>
    </div>

    <div class="signup" id="signup">
        <div class="top">
            <div>
                <h2>Sign Up</h2>
                <p>It's quick and easy</p>
            </div>
            <img src="${pageContext.request.contextPath}/img/close1.png" alt="">
        </div>
        <hr>
        <form action="<%=request.getContextPath()%>/new_User_SignUp" method="post">
            <div class="signup_body">
                <div class="name">
                    <input type="text" name="firstName" id="firstName" placeholder="First Name" class="same">
                    <input type="text" name="lastName" id="lastName" placeholder="Last Name" class="same">
                </div>
                <div class="bottom">
                    <input type="text" name="email" id="email" placeholder="Email">
                    <input type="password" name="password" id="password" placeholder="Password">
                </div>
            </div>
            <div class="birthday">
                <p class="text">Birthday</p>
                <div class="date">
                    <select name="month" id="month">
                        <option value="Jan">Jan</option>
                        <option value="Feb">Feb</option>
                        <option value="March">March</option>
                        <option value="April">April</option>
                        <option value="May">May</option>
                        <option value="June">June</option>
                        <option value="July">July</option>
                        <option value="Aug">Aug</option>
                        <option value="Sep">Sep</option>
                        <option value="Oct">Oct</option>
                        <option value="Nov">Nov</option>
                        <option value="Dec">Dec</option>
                    </select>
                    <select name="day" id="day">
                        <option value="">1</option>
                        <option value="">2</option>
                        <option value="">3</option>
                        <option value="">4</option>
                        <option value="">5</option>
                        <option value="">6</option>
                        <option value="">7</option>
                        <option value="">8</option>
                        <option value="">9</option>
                        <option value="">10</option>
                        <option value="">11</option>
                        <option value="">12</option>
                        <option value="">13</option>
                        <option value="">14</option>
                        <option value="">15</option>
                        <option value="">16</option>
                        <option value="">17</option>
                        <option value="">18</option>
                        <option value="">19</option>
                        <option value="">20</option>
                        <option value="">21</option>
                        <option value="">22</option>
                        <option value="">23</option>
                        <option value="">24</option>
                        <option value="">25</option>
                        <option value="">26</option>
                        <option value="">27</option>
                        <option value="">28</option>
                        <option value="">29</option>
                        <option value="">30</option>
                        <option value="">31</option>
                    </select>
                    <select name="year" id="year">
                        <option value="">2023</option>
                        <option value="">2022</option>
                        <option value="">2021</option>
                        <option value="">2020</option>
                        <option value="">2019</option>
                        <option value="">2018</option>
                        <option value="">2017</option>
                        <option value="">2016</option>
                        <option value="">2015</option>
                        <option value="">2014</option>
                        <option value="">2013</option>
                        <option value="">2012</option>
                        <option value="">2011</option>
                        <option value="">2010</option>
                    </select>
                </div>
            </div>

            <div class="gender">
                <p class="text">Gender</p>
                <div class="person">
                    <div>
                        <label for="female">Female</label>
                        <input type="radio" id="female" name="gender">
                    </div>
                    <div>
                        <label for="male">Male</label>
                        <input type="radio" id="male" name="gender">
                    </div>
                    <div>
                        <label for="others">Others</label>
                        <input type="radio" id="others" name="gender">
                    </div>
                </div>
            </div>

            <div class="content">
                <p>People who use our service may have uploaded your contact information to Facebook.
                    <span class="blue">Learn more.</span></p>
                <p>By clicking Sign Up, you agree to our terms,
                    <span class="blue">Privacy Policy and Cookies Policy</span>. You may receive SMS
                    notifications from us and can opt out at any time.</p>
            </div>
            <button class="signin">Sign Up</button>
        </form>
    </div>
</header>

<script src="main.js"></script>
</body>
</html>
