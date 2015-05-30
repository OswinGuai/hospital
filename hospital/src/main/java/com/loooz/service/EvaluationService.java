/**
 * 
 */
package com.loooz.service;

import com.loooz.bo.Evaluation;
import com.loooz.exception.EvaluationOperationException;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午12:00:36
 *
 */
public interface EvaluationService {

    public void doEvaluation(Evaluation evaluation) throws EvaluationOperationException;
}
