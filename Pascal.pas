var 
s:int64;
i:integer;
a,sum:double;
begin
   s := 0;
   sum := 0;
   for i := 1 to 6 do
   begin
      read(a);
      if(a > 0)then
      begin
         sum := sum + a;
         s := s + 1;
      end;
   end;
   writeln(s ,' valores positivos');
   writeln(sum / s:-1:1);
end.
