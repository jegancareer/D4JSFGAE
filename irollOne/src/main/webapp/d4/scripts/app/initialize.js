function initialize(prgcount, totalChordCount) {
	//progress bar count and name of progress display
    for (var i=0; i < prgcount; i++) {
        var o={};
        o.index=i;
        o.month=monthsMap[i % 12];
        o.year=baseYear + Math.floor(i/12);
        months.push(o);
    }

    createVerticalGradient('svg','gradient1',[
        {offset:'0%', 'stop-color':'#00AC6B'},
        {offset: '40%', 'stop-color':'#FFFFFF', 'stop-opacity':'0' },
        {offset: '60%', 'stop-color':'#FFFFFF', 'stop-opacity':'0' },
        {offset:'100%','stop-color':'#9B001C'}]);
	
    gradientGroup.transition().select("rect").delay(delay*1.5).attr("width",12);
    dGroup.transition().selectAll("text").delay(delay*1.5).style("font-size","10px");
}
