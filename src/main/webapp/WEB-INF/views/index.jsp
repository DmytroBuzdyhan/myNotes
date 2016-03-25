<%@ taglib prefix="cf" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<title>My notes</title>
	<link href="<cf:url value="/resources/css/reset.css" />" rel="stylesheet">
	<link href="<cf:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body>
	<section class="wrapper">
		<header>
			<span class="logo">
				<a href="/">My Notes</a>
			</span>
			<nav>
				<ul>
					<li>
						<a href="">Java</a>
						<ul>
							<li>
								<a href="">Spring</a>
							</li>
							<li>
								<a href="">WebServers</a>
							</li>
						</ul>
					</li>
					<li>
						<a href="">Javascript</a>
					</li>
					<li>
						<a href="">Html</a>
					</li>
					<li>
						<a href="">Css</a>
					</li>
				</ul>
			</nav>
		</header>
		<main>
			<h1>User name: ${name}</h1>
		</main>
		<footer>
			<p>.........111</p>
		</footer>
	</section>
</body>
</html>
