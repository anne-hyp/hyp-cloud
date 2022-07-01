package cn.hehe.cloud.common.validator;

import cn.hehe.cloud.common.annotation.IsMobile;
import cn.hehe.cloud.common.entity.RegexpConstant;
import cn.hehe.cloud.common.utils.HypUtil;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author hyp
 * @title: MobileValidator
 * @projectName hyp-cloud
 * @description: 手机号校验
 * @date 2022/6/20 11:43
 */
public class MobileValidator implements ConstraintValidator<IsMobile, String> {

    @Override
    public void initialize(IsMobile isMobile) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            if (StringUtils.isBlank(s)) {
                return true;
            } else {
                String regex = RegexpConstant.MOBILE_REG;
                return HypUtil.match(regex, s);
            }
        } catch (Exception e) {
            return false;
        }
    }
}
