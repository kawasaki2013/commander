/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.chooyan.commander.core.analyze;

/**
 *
 * @author chooyan_eng
 * @param <T, S>
 */
public interface Analyzer<T, S> {
    public S analyze(T parsedObject);
}
