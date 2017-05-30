
#言论 
YARN产生背景—运维成本与数据共享


#下午1 


##yarn more细节 补充

application master (node mgr,只有这里有个master)启动
	若是MR作业，下一步会计算mapper/reducer个数
	若是spark作业，则会分配对应作业的stage |这里是入乡随俗啊
	小节66-01：application master和具体的分布式应用解耦啦，不仅仅MR
	小节66-02：介绍 yarn角色时，个数，流水线上的作用，其他故障有空再说明吧

resource manager(顶层的)分为 app manager/ yarn scheculer

yarn 基于资源预留的调度策略
	小节66-03：牺牲了资源利用率，但是保证了资源分配不会落空。
	关键词：预留 not all or nothing( mesos使用的)
	
	
container 对任务运行环境的抽象
 描述一系列信息
 任务运行资源（节点、内存、 CPU）
 任务启动命令
 任务运行环境

###YARN资源调度器
 多类型资源调度
 采用DRF算法（论文：“ Dominant Resource Fairness: Fair Allocation of
Multiple Resource Types”）
 目前支持CPU和内存两种资源
####提供多种资源调度器 | MRv1 也有类似的算法 fifo 或  公平
 FIFO
 Fair Scheduler
 Capacity Scheduler
####多租户资源调度器 66:这里有意思，某些用户区别对待
 支持资源按比例分配
 支持层级队列划分方式	

###YARN资源隔离方案
	小节66-04：内存决定生死 关键
	
 支持内存和CPU两种资源隔离
 内存是一种“决定生死”的资源
 CPU是一种“影响快慢”的资源
####内存隔离
 基于线程监控的方案
#### CPU隔离
 默认不对CPU资源进行隔离

###YARN支持的调度语义
	66:针对MR v2.0
	
####支持的语义
 请求某个特定节点/机架上的特定资源量
 将某些节点加入（或移除）黑名单，不再为自己分配这些节点上的资
源
 请求归还某些资源


####不支持的语义

 请求任意节点/机架上的特定资源量
		eg:从任意Node上 请求10G 
		66 more: 不是特别懂,是请求目标不确定 不可行吗 ？
		
		
 请求一组或几组符合某种特质的资源
		eg:请求10G内存，分成10块
 超细粒度资源
		eg:将某task绑定在某cpu上
 动态调整Container资源
		eg:运行后调大内存

###其他
  简单的看了下 spark yarn的工作流程图		
  
		
		
