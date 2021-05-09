package org.springframework.samples.component

import org.springframework.beans.factory.DisposableBean
import javax.annotation.PreDestroy

/**
 * bean销毁生命周期
 * @author wangyong
 */
class BeanDestroyLiftCycle : DisposableBean {


	override fun destroy() {
		println("destroy...")
	}


	@PreDestroy
	fun preDestroy(){
		println("preDestroy...")
	}


	fun destroyMethod(){
		println("destroyMethod...")
	}




}