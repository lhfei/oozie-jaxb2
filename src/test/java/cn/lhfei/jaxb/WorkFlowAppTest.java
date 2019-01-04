/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.lhfei.jaxb;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uri.oozie.hive2_action._1.ACTION;
import uri.oozie.hive2_action._1.DELETE;
import uri.oozie.hive2_action._1.PREPARE;
import uri.oozie.workflow._1.END;
import uri.oozie.workflow._1.START;
import uri.oozie.workflow._1.WORKFLOWAPP;

/**
 * @version 0.1
 *
 * @author Hefei Li
 *
 * @Created Jan 04, 2019
 */
public class WorkFlowAppTest {
	Logger LOG = LoggerFactory.getLogger(WorkFlowAppTest.class);

	@Test
	public void generateWorkFlow() throws JAXBException {
		JAXBContext jc = JAXBContext.newInstance(WORKFLOWAPP.class);
		Marshaller m = jc.createMarshaller();
		StringWriter sw = new StringWriter();
		
		WORKFLOWAPP workflow = new WORKFLOWAPP();
		
		workflow.setName("First Workflow by Hive2");
		
		START start = new START();
		start.setTo("echo message");
		
		END end = new END();
		end.setName("OK");
		
		
		workflow.setStart(start);
		workflow.setEnd(end);
		
		ACTION action = new ACTION();
		action.setNameNode("Hive2 Action");
		action.setResourceManager("host-10-182-60-239:8020");
		action.setNameNode("host-10-182-60-239:8020");
		action.setJdbcUrl("jdbc:hive2://host-10-182-60-239:2181,host-10-182-61-102:2181,host-10-182-60-250:2181/;serviceDiscoveryMode=zooKeeper;zooKeeperNamespace=hiveserver2");
		action.setScript("count.q");
		
		PREPARE prepare = new PREPARE();
		DELETE delete = new DELETE();
		delete.setPath("${jobOutput}");
		prepare.getDelete().add(delete);
		
		action.setPrepare(prepare);
		
//		workflow.getDecisionOrForkOrJoin().add(action);

		
		// XML Document output
//		m.marshal(workflow, System.out);
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	
		JAXBElement<WORKFLOWAPP> jaxbElement = new JAXBElement<>(
				new QName("uri:oozie:workflow:1.0", "workflowapp"),
				WORKFLOWAPP.class,
				workflow);
		
		
//		m.marshal(workflow, sw);
		
		m.marshal(jaxbElement, sw);
		
		String xml = sw.toString();
		
		LOG.info("XML Document ==\n{}", xml);
		
	}
}
