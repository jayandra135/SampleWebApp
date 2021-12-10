package tags;
import javax.servlet.jsp.*;  
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;


public class IteratorTag extends BodyTagSupport 
{
		private int counts=0;
		private BodyContent bodyContent;
		
		public void setBodyContent(BodyContent bodyContent)
		{
			this.bodyContent=bodyContent;
		}
		public void setCounts(int counts)
		{
			this.counts=counts;
		}
		public int doStartTag() throws JspException
		{
			if(counts>0)
				return EVAL_BODY_TAG;
			else
				return SKIP_BODY;
		}
		public int doEndTag() throws JspException
		{
			try
			{
				if(bodyContent!=null)
					bodyContent.writeOut(bodyContent.getEnclosingWriter());
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return EVAL_PAGE;
		}
		public int doAfterBody() throws JspException
		{
			if(counts>1)
			{
				 counts--;
				 return EVAL_BODY_TAG;
			}
				
			else
			{
				return SKIP_BODY;
			}
				
			
		}
}
