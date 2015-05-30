/**
 * 
 */
package com.loooz.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.loooz.bo.Evaluation;
import com.loooz.constants.ErrorInfo;
import com.loooz.dao.EvaluationDao;
import com.loooz.exception.EvaluationOperationException;
import com.loooz.service.EvaluationService;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午2:02:12
 *
 */
@Service("evaluationService")
public class EvaluationServiceImpl implements EvaluationService {

    @Resource
    private EvaluationDao dao;
    
    /* (non-Javadoc)
     * @see com.loooz.service.EvaluateService#doEvaluation(com.loooz.bo.Evaluation)
     */
    @Override
    public void doEvaluation(Evaluation evaluation) throws EvaluationOperationException {
        if (evaluation.getReportId() <= 0) {
            throw new EvaluationOperationException(ErrorInfo.NON_EXIST_DIAGNOSE_RECORD);
        }
        dao.insertEvaluation(evaluation);
    }

}
