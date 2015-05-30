/**
 * 
 */
package com.loooz.dao;

import org.springframework.stereotype.Repository;

import com.loooz.bo.Evaluation;

/**
 * @description 
 * @author Pei Zhongyi
 * @date 2015年5月28日 下午2:03:52
 *
 */
@Repository
public interface EvaluationMapper {

    public void insertEvaluation(Evaluation evaluation);
}
