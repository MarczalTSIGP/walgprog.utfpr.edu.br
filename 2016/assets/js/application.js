$(document).ready(function() {

   $('a.article-toggle').click(function (event) {
      event.preventDefault();
      var article_details = $(this).parent().siblings('.article-info');
      article_details.slideToggle( "slow", function() {} );
      console.log(article_details);
   });
});
