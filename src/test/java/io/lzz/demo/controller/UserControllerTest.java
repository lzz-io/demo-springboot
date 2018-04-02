/*
 * Copyright qq:1219331697
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.lzz.demo.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author q1219331697
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// 定义测试执行顺序（按方法名升序）
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {

	@Autowired
	private WebApplicationContext context;

	private MockMvc mockMvc;

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void test01Index() throws Exception {
		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/user").accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int statusCode = mvcResult.getResponse().getStatus();
		Assert.assertEquals(200, statusCode);
		String body = mvcResult.getResponse().getContentAsString();
		System.out.println("body:" + body);
	}

	@Test
	public void testEditNew() {
	}

	@Test
	public void testCreate() {
	}

	@Test
	public void testShow() {
	}

	@Test
	public void testEdit() {
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDestroy() {
	}

}
