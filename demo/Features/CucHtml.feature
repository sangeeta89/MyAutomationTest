
Feature: Login to Facebook

	Scenario: Loggin to Facebook and Check Forgot Password should exist
		Given I have open the browser
		When I open Facebook website
		Then Login Button should exist
		Then Forgot password link should exist