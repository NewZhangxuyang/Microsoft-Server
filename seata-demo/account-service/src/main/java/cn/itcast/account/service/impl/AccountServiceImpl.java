package cn.itcast.account.service.impl;

import cn.itcast.account.mapper.AccountMapper;
import cn.itcast.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 虎哥
 */
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    @Transactional
    public void deduct(String userId, int money) {
        log.info("开始扣款");
        try {
            accountMapper.deduct(userId, money);
        } catch (Exception e) {
            throw new RuntimeException("扣款失败，可能是余额不足！", e);
        }
        log.info("扣款成功");
    }

    /*public void  pickCapacity(List<String> listStepParam,List<String> listStep){
        Map<String, Object> map = new HashMap<>();
        List<Map<String, Object>> list = new ArrayList<>();
        List<Map<String, String>> entireStepData = new ArrayList<>();

        for (String step : listStep) {
            Map<String, String> paramsMap = new HashMap<>(64);
            for (String stepParam: listStepParam) {
                if(listStep.equals(stepDetail)){

                    System.out.println("参数匹配,为该工步的参数,做处理,保留该参数的Code and Value");
                    paraMap.put("Code","Value");

                }
            }

            entireStepData.add(paraMap);
        }
    }*/
}
