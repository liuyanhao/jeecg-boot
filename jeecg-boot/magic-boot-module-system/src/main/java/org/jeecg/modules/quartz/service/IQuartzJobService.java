package org.jeecg.modules.quartz.service;

import java.util.List;
import org.jeecg.modules.quartz.entity.QuartzJob;
import org.quartz.SchedulerException;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 定时任务在线管理
 * @Author: liuyanhao
 * @Date: 2020-09-28
 * @Version: V1.1
 */
public interface IQuartzJobService extends IService<QuartzJob> {

    /**
     * 根据任务类名称查询任务
     * @param jobClassName
     * @return
     */
	List<QuartzJob> findByJobClassName(String jobClassName);

    /**
     * 保存和计划任务
     * @param quartzJob
     * @return
     */
	boolean saveAndScheduleJob(QuartzJob quartzJob);

    /**
     * 编辑和计划任务
     * @param quartzJob
     * @return
     * @throws SchedulerException
     */
	boolean editAndScheduleJob(QuartzJob quartzJob) throws SchedulerException;

    /**
     * 删除和停止任务
     * @param quartzJob
     * @return
     */
	boolean deleteAndStopJob(QuartzJob quartzJob);

    /**
     * 恢复任务
     * @param quartzJob
     * @return
     */
	boolean resumeJob(QuartzJob quartzJob);

	/**
	 * 执行定时任务
	 * @param quartzJob
	 */
	void execute(QuartzJob quartzJob) throws Exception;

	/**
	 * 暂停任务
	 * @param quartzJob
	 * @throws SchedulerException
	 */
	void pause(QuartzJob quartzJob);
}
