package com.micropower.manager.service;

import com.micropower.manager.model.po.Cabinetparamter;

/**
 * Created by oliver on 2017/9/4.
 */
public interface CabinetSetService extends BaseService<Cabinetparamter> {

    Integer recoverDeafult();

    Cabinetparamter queryParameterByType(String parametertype);
}
