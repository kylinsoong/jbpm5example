package org.jbpm.demo.rewards.basic.ejb;

import javax.ejb.Remote;

@Remote
public interface ProcessRemote {

	public long startProcess(String recipient) throws Exception;
}
