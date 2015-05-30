package com.dbg.controller;

import com.google.gson.Gson;

public abstract class AbstractController {

	protected Gson mapper = new Gson();

	protected abstract void initRoutes();

}
