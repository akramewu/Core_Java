package templates;

import java.util.List;

public class Feature
{
  private String project;
  private String suite;
  private String section;
  private String title;
  private List<String> steps;

  public void setProject(String project)
  {
    this.project = project;

  }

  public String getProject()
  {
    return project;
  }

  public void setSuite(String suite)
  {
    this.suite = suite;

  }

  public String getSuite()
  {
    return suite;
  }


  public void setSection(String section)
  {
    this.section = section;

  }

  public String getSection()
  {
    return section;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public String getTitle()
  {
    return title;
  }

  public void setSteps(List<String> steps)
  {
    this.steps = steps;
  }

  public List<String> getSteps()
  {
    return steps;
  }

  @Override
  public String toString()
  {
    return "Feature [project=" + project + ", suite=" + suite + ", section=" + section + ", title="
        + title + ", steps=" + steps + "]";
  }



}
