<#macro shownews>
<#local isEdit=false>
<#if editNews?exists && editNews?has_content>
	<#local isEdit=true>
</#if>
  <table border=1>
<#if isEdit>
  <form method="post" action="/GradleSpringProject/controller/news/editok">
  <input type="hidden" name="id" id="id" value="${editNews.id!}">
<#else>
  <form method="post" action="/GradleSpringProject/controller/news/add">
</#if>
  <tr height="100">
	<td colspan="2" align="center"><#if isEdit>修改<#else>添加</#if></td>
  </tr>
  <tr height="30">
	<td width="70" align="right">类别</td>
	<td>
		<select name="targetid" id="targetid">
<#list 0..6 as t>
<option value="${t}"<#if (isEdit && editNews.targetid==t)> selected</#if>><#if t==0> .未定. <#else>${t}</#if></option>
</#list>
		</select>
	</td>
  </tr>
  <tr height="30">
	<td align="right">标题</td>
	<td><input type="text" name="title" id="title" value="<#if (isEdit)>${editNews.title!}</#if>"></td>
  </tr>
  <tr height="30">
	<td align="right">内容</td>
	<td><textarea name="content" id="content" rows="6" cols="50"><#if (isEdit)>${editNews.content!}</#if></textarea></td>
  </tr>
  <tr height="30">
	<td align="right">状态</td>
	<td><input type="checkbox" name="state" id="state" value="1"<#if (isEdit && editNews.state==1)> checked</#if>></td>
  </tr>
  <tr height="60">
	<td colspan="2" align="center"><input type="submit" value=". 提交 ."></td>
  </tr>
  </form>
  </table>
</#macro>