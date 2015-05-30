/**
 * 
 */
package com.loooz.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.Evaluation;
import com.loooz.dao.EvaluationDao;
import com.loooz.dao.EvaluationMapper;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午2:11:43
 *
 */
@Service("evaluationDao")
public class EvaluationDaoImpl implements EvaluationDao {

    @Resource
    private EvaluationMapper mapper;
    
    /* (non-Javadoc)
     * @see com.loooz.dao.EvaluationDao#insertEvaluation(com.loooz.bo.Evaluation)
     */
    @Override
    public void insertEvaluation(Evaluation evaluation) {
        mapper.insertEvaluation(evaluation);
    }

}
