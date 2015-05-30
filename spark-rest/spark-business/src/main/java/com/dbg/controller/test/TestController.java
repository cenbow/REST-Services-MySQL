package com.dbg.controller.test;

import java.util.regex.Pattern;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import com.dbg.controller.AbstractController;
import com.dbg.model.error.ResponseError;
import com.dbg.service.test.TestService;

public class TestController extends AbstractController {

	private TestService testService;

	public TestController() {
		testService = new TestService();
		initRoutes();
	}

	@Override
	protected void initRoutes() {
		Spark.setPort(8080);

		Spark.get(new Route("/test/:id") {

			@Override
			public Object handle(Request request, Response response) {
				response.type("application/json");
				final String id = request.params(":id");
				if (id == null || !Pattern.matches("[0-9]+", id)) {
					response.status(400);
					return mapper.toJson(new ResponseError("Bad Request!"));
				}
				response.status(200);
				return mapper.toJson(testService.findById(Integer.valueOf(id)));
			}
		});
	}
}
