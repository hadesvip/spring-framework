package org.springframework.samples

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.DisposableBean

/**
 * 优雅停止应用
 * @author wangyong
 */
class ShutdownApplicationTest : DisposableBean {

	@Test
	fun  shutdownApplicationTest() {
		Runtime.getRuntime().addShutdownHook(Thread {
			println("执行 shutdownHook")
		})
	}

	override fun destroy() {
		TODO("Not yet implemented")
	}

}

