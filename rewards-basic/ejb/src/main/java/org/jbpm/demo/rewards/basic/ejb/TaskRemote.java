package org.jbpm.demo.rewards.basic.ejb;

import java.util.List;

import javax.ejb.Remote;

import org.jbpm.task.query.TaskSummary;

@Remote
public interface TaskRemote {

	public List<TaskSummary> retrieveTaskList(String actorId) throws Exception;

    public void approveTask(String actorId, long taskId) throws Exception;
}
