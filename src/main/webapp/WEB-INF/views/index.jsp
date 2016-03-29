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
		<header class="tool-bar">
			<div class="tool-bar-wrapper">
				<nav>
					<ul>
						<c:forEach var="topic" items="${topics}">
							<li>
								<a href="">${topic.name}</a>
							</li>
						</c:forEach>
					</ul>
				</nav>
			</div>
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
