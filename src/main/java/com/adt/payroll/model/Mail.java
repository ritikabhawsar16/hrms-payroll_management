/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adt.payroll.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.File;

public class Mail implements Serializable {
    private String from;
    private String to;
    private String subject;
    private String content;
    private Map<String, String> model;
    private HashMap<String,File> attachments;
    private int empId;
    private List<String> toArray;
    
    public Mail() {
        model = new HashMap<>();
    }

    public Mail(String from, String to, String subject, String content, HashMap<String, File> attachments, Map<String, String> model, int empId) {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.content = content;
        this.attachments = attachments;
        this.model = model;
        this.empId = empId;
    }

    public void setAttachments(HashMap<String, File> attachments) {
        this.attachments = attachments;
    }

    public HashMap<String, File> getAttachments() {
        return attachments;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getModel() {
        return model;
    }

    public void setModel(Map<String, String> model) {
        this.model = model;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public List<String> getToArray() {
		return toArray;
	}

	public void setToArray(List<String> toArray) {
		this.toArray = toArray;
	}

   }