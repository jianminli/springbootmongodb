package com.hsbc.group.digital.cadabra.data.svc.dao;

import com.hsbc.group.digital.cadabra.data.svc.entities.DemoEntity;

public interface DemoDao {
	void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
