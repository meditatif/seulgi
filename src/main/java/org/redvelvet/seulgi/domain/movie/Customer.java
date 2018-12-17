package org.redvelvet.seulgi.domain.movie;

import org.redvelvet.seulgi.base.domain.Entity;

public class Customer implements Entity {
	private Long id;
	private String name;

	public Customer(String name) {
		this.name = name;
	}

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
