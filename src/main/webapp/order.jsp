<%--
  Created by IntelliJ IDEA.
  User: jeanette
  Date: 4/12/21
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Pizza Order Page</h1>
<form method="POST" action="${pageContext.request.contextPath}/pizza-order">
  <div>
  <label for="crust">
      Crust
        <select id="crust" name="crust">
          <option value="thin">Thin Crust</option>
          <option value="stuffed">Stuffed Crust</option>
          <option value="garlic">Garlic Crust</option>
        </select>
  </label>
  </div>
  <br><br>
  <div>
    <label for="sauce">
      Sauce
        <select id="sauce" name="sauce">
          <option value="marinara">Marinara</option>
          <option value="whiteGarlic">White Garlic Sauce</option>
          <option value="pesto">Pesto</option>
        </select>
    </label>
  </div>
  <br><br>
  <div>
    <label for="size">
      Size
      <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium </option>
        <option value="large">Large</option>
      </select>
    </label>
  </div>
  <br><br>
  <fieldset>
    <h3>Toppings: </h3>
    <br>

    <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" id="pepperoni" value="pepperoni" name="toppings">
    <label for="pepperoni">Jalapeno</label>
    <input type="checkbox" id="jalapeno" value="jalapeno" name="toppings">
    <label for="pepperoni">Pineapples</label>
    <input type="checkbox" id="pineapples" value="pineapples" name="toppings">
    <label for="pepperoni">Mushrooms</label>
    <input type="checkbox" id="mushrooms" value="mushrooms" name="toppings">

  </fieldset>
  <br><br>
  <label for="address">Delivery Address
    <input id="address" type="text" name="address">
  </label>
  <br><br>
  <button type="submit">Submit</button>
</form>
</body>
</html>
