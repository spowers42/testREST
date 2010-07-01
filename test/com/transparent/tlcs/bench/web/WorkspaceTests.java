package com.transparent.tlcs.bench.web;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;
import com.transparent.tlcs.bench.web.Workspace;
import javax.servlet.http.HttpServletResponse;

public class WorkspaceTests extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testMakeWorkspace() throws Exception{
		Workspace workspace = new Workspace();
		ModelAndView modelAndView = workspace.makeWorkspace(null, null);
		assertEquals("test", modelAndView.getViewName());
	}
	
	public void testDeleteWorkspace() throws Exception{
		Workspace workspace = new Workspace();
		ModelAndView modelAndView = workspace.deleteWorkspace(null, null);
		assertEquals("empty", modelAndView.getViewName());
	}

}
