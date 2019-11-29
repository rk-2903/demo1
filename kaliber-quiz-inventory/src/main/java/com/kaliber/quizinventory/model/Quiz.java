package com.kaliber.quizinventory.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

@Document(collection = "quizzes")
public class Quiz {
    @Id
    UUID quizId;

	@Indexed(unique=true)
	private String quizCode;
	private String title;
	@Indexed
	private String createdBy;
	private String authoredBy;
	private String publishedBy;
	@CreatedDate
	private Date createDate=new Date();
	@LastModifiedDate
	private Date updateDate=new Date();
	private String subject;
	////////
	private String quizInstructions;
	/////////////
	private int maxDurationMinutes;
	private float maxScore;
	private String description;
	private float points;
	private ArrayList<Sections> sections=new ArrayList<>();
	private statusValue statusvalue;
	public enum statusValue {DRAFT, PENDING, PUBLISHED, OPEN, CLOSE};
	public enum visibilityCode {PUBLIC,PRIVATE,FOLLOWERS};
	private visibilityCode visibility;
	public enum proficiencyCode { NOVICE, BEGINNER, COMPETENT, PROFICIENT, EXPERT};
	private proficiencyCode proficiency;
	public enum quizTypeCode {QUIZ,SURVEY};
	private quizTypeCode quizType;
	private String concepts[];
	private Date openTS=new Date();
	private Date closeTS=new Date();
	private boolean allowWager;
	private int maxAttempts;
	private int maxQuestions;
	private int totalQuestions;
	private enum questionSelectionCode{INSTRUCT,SPECIFY};
	private questionSelectionCode questionSelection;
	private ArrayList<ConfidenceWager> confidenceWager=new ArrayList<ConfidenceWager>();
	private ArrayList<Preferences> preferences=new ArrayList<Preferences>();
    private ArrayList<ReportQuiz> reportQuiz = new ArrayList<>();

//	private float points;

	public Quiz(UUID quizId, String quizCode, String title, String createdBy, String authoredBy, String publishedBy,float points, Date createDate, Date updateDate, String subject, String quizInstructions,int maxDurationMinutes, float maxScore, String description, ArrayList<Sections> sections, statusValue statusvalue, visibilityCode visibility, proficiencyCode proficiency, quizTypeCode quizType, String[] concepts, Date openTS, Date closeTS, boolean allowWager, int maxAttempts, int maxQuestions, int totalQuestions, questionSelectionCode questionSelection, ArrayList<ConfidenceWager> confidenceWager, ArrayList<Preferences> preferences) {
		this.quizId = quizId;
	    this.quizCode = quizCode;
		this.title = title;
		this.createdBy = createdBy;
		this.authoredBy = authoredBy;
		this.publishedBy = publishedBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.subject = subject;
		////////
		this.quizInstructions=quizInstructions;
		////////
		this.maxDurationMinutes = maxDurationMinutes;
//		this.points = points;
		this.maxScore = maxScore;
		this.description = description;
		this.points = points;
		this.sections = sections;
		this.statusvalue = statusvalue;
		this.visibility = visibility;
		this.proficiency = proficiency;
		this.quizType = quizType;
		this.concepts = concepts;
		this.openTS = openTS;
		this.closeTS = closeTS;
		this.allowWager = allowWager;
		this.maxAttempts = maxAttempts;
		this.maxQuestions = maxQuestions;
		this.totalQuestions = totalQuestions;
		this.questionSelection = questionSelection;
		this.confidenceWager = confidenceWager;
		this.preferences = preferences;
	}

    public Quiz(UUID quizId, String quizCode, String title, String createdBy, String authoredBy, String publishedBy, Date createDate, Date updateDate, String subject, String quizInstructions, int maxDurationMinutes, float maxScore, String description, float points, ArrayList<Sections> sections, statusValue statusvalue, visibilityCode visibility, proficiencyCode proficiency, quizTypeCode quizType, String[] concepts, Date openTS, Date closeTS, boolean allowWager, int maxAttempts, int maxQuestions, int totalQuestions, questionSelectionCode questionSelection, ArrayList<ConfidenceWager> confidenceWager, ArrayList<Preferences> preferences, ArrayList<ReportQuiz> reportQuiz) {
        this.quizId = quizId;
        this.quizCode = quizCode;
        this.title = title;
        this.createdBy = createdBy;
        this.authoredBy = authoredBy;
        this.publishedBy = publishedBy;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.subject = subject;
        this.quizInstructions = quizInstructions;
        this.maxDurationMinutes = maxDurationMinutes;
        this.maxScore = maxScore;
        this.description = description;
        this.points = points;
        this.sections = sections;
        this.statusvalue = statusvalue;
        this.visibility = visibility;
        this.proficiency = proficiency;
        this.quizType = quizType;
        this.concepts = concepts;
        this.openTS = openTS;
        this.closeTS = closeTS;
        this.allowWager = allowWager;
        this.maxAttempts = maxAttempts;
        this.maxQuestions = maxQuestions;
        this.totalQuestions = totalQuestions;
        this.questionSelection = questionSelection;
        this.confidenceWager = confidenceWager;
        this.preferences = preferences;
        this.reportQuiz = reportQuiz;
    }

    public Quiz(String quizCode, String title, String authoredBy, String subject, String[] concepts) {
		this.quizCode = quizCode;
		this.title = title;
		this.authoredBy = authoredBy;
		this.subject = subject;
		this.concepts = concepts;
	}

	public Quiz() {
	}
	public String getQuizCode() {
		return quizCode;
	}

//	public void setPoints(float points) {
//		this.points = points;
//	}
//	public float getPoints() {
//		return points;
//	}

	public void setQuizCode(String quizCode) {
		this.quizCode = quizCode;
	}
	public float getPoints() {
		return points;
	}

	public void setPoints(float points) {
		this.points = points;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getAuthoredBy() {
		return authoredBy;
	}
	public void setAuthoredBy(String authoredBy) {
		this.authoredBy = authoredBy;
	}
	public String getPublishedBy() {
		return publishedBy;
	}
	public void setPublishedBy(String publishedBy) {
		this.publishedBy = publishedBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/////////
	public String getQuizInstructions()
	{
		return quizInstructions;
	}
	public void setQuizInstructions(String quizInstructions)
	{
		this.quizInstructions = quizInstructions;
	}
	/////////
	public int getMaxDurationMinutes() {
		return maxDurationMinutes;
	}
	public void setMaxDurationMinutes(int maxDurationMinutes) {
		this.maxDurationMinutes = maxDurationMinutes;
	}
	public float getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(float maxScore) {
		this.maxScore = maxScore;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Sections> getSections() {
		return sections;
	}
	public void setSections(ArrayList<Sections> sections) {
		this.sections = sections;
	}

	public statusValue getStatusvalue() {
		return statusvalue;
	}

	public void setStatusvalue(statusValue statusvalue) {
		this.statusvalue = statusvalue;
	}

	public visibilityCode getVisibility() {
		return visibility;
	}
	public void setVisibility(visibilityCode visibility) {
		this.visibility = visibility;
	}
	public proficiencyCode getProficiency() {
		return proficiency;
	}
	public void setProficiency(proficiencyCode proficiency) {
		this.proficiency = proficiency;
	}
	public quizTypeCode getQuizType() {
		return quizType;
	}
	public void setQuizType(quizTypeCode quizType) {
		this.quizType = quizType;
	}
	public String[] getConcepts() {
		return concepts;
	}
	public void setConcepts(String[] concepts) {
		this.concepts = concepts;
	}
	public Date getOpenTS() {
		return openTS;
	}
	public void setOpenTS(Date openTS) {
		this.openTS = openTS;
	}
	public Date getCloseTS() {
		return closeTS;
	}
	public void setCloseTS(Date closeTS) {
		this.closeTS = closeTS;
	}
	public boolean isAllowWager() {
		return allowWager;
	}
	public void setAllowWager(boolean allowWager) {
		this.allowWager = allowWager;
	}
	public int getMaxAttempts() {
		return maxAttempts;
	}
	public void setMaxAttempts(int maxAttempts) {
		this.maxAttempts = maxAttempts;
	}
	public int getMaxQuestions() {
		return maxQuestions;
	}
	public void setMaxQuestions(int maxQuestions) {
		this.maxQuestions = maxQuestions;
	}
	public int getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public questionSelectionCode getQuestionSelection() {
		return questionSelection;
	}
	public void setQuestionSelection(questionSelectionCode questionSelection) {
		this.questionSelection = questionSelection;
	}
	public ArrayList<ConfidenceWager> getConfidenceWager() {
		return confidenceWager;
	}
	public void setConfidenceWager(ArrayList<ConfidenceWager> confidenceWager) {
		this.confidenceWager = confidenceWager;
	}
	public ArrayList<Preferences> getPreferences() {
		return preferences;
	}
	public void setPreferences(ArrayList<Preferences> preferences) {
		this.preferences = preferences;
	}

    public ArrayList<ReportQuiz> getReportQuiz() {
        return reportQuiz;
    }

    public void setReportQuiz(ArrayList<ReportQuiz> reportQuiz) {
        this.reportQuiz = reportQuiz;
    }

    @Override
	public String toString() {
		return "Quiz{" +
				"quizCode='" + quizCode + '\'' +
				", title='" + title + '\'' +
				", createdBy='" + createdBy + '\'' +
				", authoredBy='" + authoredBy + '\'' +
				", publishedBy='" + publishedBy + '\'' +
				", createDate=" + createDate +
				", updateDate=" + updateDate +
				", subject='" + subject + '\'' +
				//////////
				", quizInstructions='" + quizInstructions + '\'' +
				//////////
				", maxDurationMinutes=" + maxDurationMinutes +
				", maxScore=" + maxScore +
				", description='" + description + '\'' +
				", sections=" + sections +
				", statusvalue=" + statusvalue +
				", visibility=" + visibility +
				", proficiency=" + proficiency +
				", quizType=" + quizType +
				", concepts=" + Arrays.toString(concepts) +
				", openTS=" + openTS +
				", closeTS=" + closeTS +
				", allowWager=" + allowWager +
				", maxAttempts=" + maxAttempts +
				", maxQuestions=" + maxQuestions +
				", totalQuestions=" + totalQuestions +
				", questionSelection=" + questionSelection +
				", confidenceWager=" + confidenceWager +
				", preferences=" + preferences +
				'}';
	}

    public UUID getQuizId() {
        return quizId;
    }

    public void setQuizId(UUID quizId) {
        this.quizId = quizId;
    }
}
