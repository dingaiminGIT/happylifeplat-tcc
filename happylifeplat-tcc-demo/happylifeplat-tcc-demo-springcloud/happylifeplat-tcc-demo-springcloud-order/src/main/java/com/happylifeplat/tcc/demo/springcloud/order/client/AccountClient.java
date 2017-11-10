/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.happylifeplat.tcc.demo.springcloud.order.client;

import com.happylifeplat.tcc.annotation.Tcc;
import com.happylifeplat.tcc.demo.springcloud.order.configuration.MyConfiguration;
import com.happylifeplat.tcc.demo.springcloud.order.dto.AccountDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaoyu
 */
@FeignClient(value = "account-service", configuration = MyConfiguration.class)
public interface AccountClient {

    /**
     * 用户账户付款
     *
     * @param accountDO 实体类
     * @return true 成功
     */
    @PostMapping("/account-service/account/payment")
    @Tcc
    Boolean payment(@RequestBody AccountDTO accountDO);

}
