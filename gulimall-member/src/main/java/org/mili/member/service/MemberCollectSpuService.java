package org.mili.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mili.common.utils.PageUtils;
import org.mili.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author sherlock
 * @email mamenglong076@qq.com
 * @date 2021-01-25 15:18:33
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

