package org.jbpm.demo.rewards.basic.ejb;

public interface ProcessRemote {

	public long startProcess(String recipient) throws Exception;
}
