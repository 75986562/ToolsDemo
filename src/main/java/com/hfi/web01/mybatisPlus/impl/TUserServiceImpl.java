package com.hfi.web01.mybatisPlus.impl;

import com.hfi.web01.mybatisPlus.entity.TUser;
import com.hfi.web01.mybatisPlus.mapper.TUserMapper;
import com.hfi.web01.mybatisPlus.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author NZH
 * @since 2019-04-20
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
