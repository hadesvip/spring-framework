package org.springframework.samples.service

import org.springframework.beans.factory.DisposableBean

/**
 * 测试
 * @author wangyong
 */
class ShutDisposableBean : DisposableBean {

	override fun destroy() {
		println("ShutDisposableBean 已销毁")
	}

}