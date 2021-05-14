package org.springframework.samples.component

import org.springframework.context.SmartLifecycle

/**
 * 自定义lifecycle
 * @author wangyong
 */
class CustomLifeCycle : SmartLifecycle {
	override fun start() {
		println("Lifecycle启动...")
	}

	override fun stop() {
		println("Lifecycle停止...")
	}

	override fun isRunning(): Boolean {
		return true
	}
}